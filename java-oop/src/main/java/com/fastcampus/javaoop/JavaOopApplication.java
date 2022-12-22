package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JavaOopApplication {
    public static void main(String[] args) {
//    원래는 JavaSort<String> sort = new JavaSort<>(); 이거인데 interface를 만들면
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
