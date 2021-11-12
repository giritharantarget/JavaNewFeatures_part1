package com.projects.javanewfeature_1.service;

 // All the implementaion has to te in same class else
// else we need to use permits
// JAVA 15
// different implementation has to be same module
sealed interface TrafficLight permits RedLight, GreenLight,FlashLight {
}


final class RedLight implements TrafficLight{}
final class GreenLight implements TrafficLight{}

