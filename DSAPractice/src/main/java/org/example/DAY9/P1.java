package org.example.DAY9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

//A popular online retailer allows vendors to specify different prices in advance
//for the same item throughout the day. We now need to design an algorithm that
//helps identify the lowest price for the item at any point of the day.
//
//Assumptions:
//
//For the algorithm, assume all vendors are selling the same product
//and there is only one product being sold. Given a list that has
//vendor information - ( startTime, endTime, price ) of the deal,
//        return a sorted list with different possible intervals and
//the least price of the product during the interval.
//
//The interval is inclusive of start and end time.
//
//All the 3 values passed by the vendor are integers.
//
//        sampleInput = { new Interval( 1, 5, 20 ), new Interval( 3, 8, 15 ), new Interval( 7, 10, 8 ) };
//expectedOutput = { new Interval( 1, 2, 20 ), new Interval( 3, 6, 15 ), new Interval( 7, 10, 8 ) };
public class P1
{
    static class Event {
        int time;
        int price;
        boolean start;
        Event(int time, int price, boolean start) {
            this.time = time;
            this.price = price;
            this.start = start;
        }
    }
    public static void main(String[] args) {
        List<Interval> input = List.of(
                new Interval(1, 5, 20),
                new Interval(3, 8, 15),
                new Interval(7, 10, 8)
        );
        List<Interval> result = getLowestPriceIntervals(input);
        for (Interval i : result)
            System.out.println(i);
    }

    public static  List<Interval> getLowestPriceIntervals(List<Interval> input){
        List<Event> events = new ArrayList<>();
        for (Interval i : input) {
            events.add(new Event(i.start, i.price, true));
            events.add(new Event(i.end + 1, i.price, false));
        }
        events.sort(Comparator.comparingInt(e -> e.time));
        TreeMap<Integer, Integer> activePrices = new TreeMap<>();
        List<Interval> result = new ArrayList<>();
        int prevTime = -1;
        int prevPrice = -1;
        for (Event e : events) {
            if (prevPrice != -1 && prevTime < e.time) {
                if (prevPrice != -1 && prevTime < e.time) {
                    Interval newInterval = new Interval(prevTime, e.time - 1, prevPrice);
                    if (!result.isEmpty()) {
                        Interval last = result.get(result.size() - 1);
                        if (last.price == newInterval.price && last.end + 1 == newInterval.start) {
                            last.end = newInterval.end;
                        } else {
                            result.add(newInterval);
                        }
                    } else {
                        result.add(newInterval);
                    }
                }
            }if (e.start) {
                activePrices.put(e.price,
                        activePrices.getOrDefault(e.price, 0) + 1);
            } else {
                int count = activePrices.get(e.price);

                if (count == 1)
                    activePrices.remove(e.price);
                else
                    activePrices.put(e.price, count - 1);
            }
            prevTime = e.time;
            if (!activePrices.isEmpty())
                prevPrice = activePrices.firstKey();
            else
                prevPrice = -1;
        }
        return result;
    }
}

class Interval {

    int start;
    int end;
    int price;

    Interval(int s, int e, int p) {
        start = s;
        end = e;
        price = p;
    }

    public String toString() {
        return "(" + start + "," + end + "," + price + ")";
    }
}
