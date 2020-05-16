package com.wealth.certificate.study_1z0_809.chapter11.unit.instance_met_obj_particular_type;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shipment {
	public double calculateWeight() {
         double weight = 0;
         // Calculate weight
         return weight;
    }
	public List<Double> calculateOnShipments(
	     List<Shipment> l, Function<Shipment, Double> f) {
	     List<Double> results = new ArrayList<>();
	     for(Shipment s : l) {
	         results.add(f.apply(s));
	     }
	     return results;
	}
	public void method1() {
		List<Shipment> l = new ArrayList<Shipment>();

		// Using an anonymous class
		calculateOnShipments(l, new Function<Shipment, Double>() {
		     public Double apply(Shipment s) { // The object
		         return s.calculateWeight(); // The method
		     }
		});

		// Using a lambda expression
		calculateOnShipments(l, s -> s.calculateWeight());

		// Using a method reference
		calculateOnShipments(l, Shipment::calculateWeight);
	}
}
