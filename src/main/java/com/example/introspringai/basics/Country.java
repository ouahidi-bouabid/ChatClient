package com.example.introspringai.basics;

import lombok.*;

/*
public record Country(String name, long population, String flagColor) {
}
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Country {
    String name;
    long population;
    String flagColor;

}
