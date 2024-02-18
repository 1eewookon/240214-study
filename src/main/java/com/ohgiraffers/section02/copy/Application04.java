package com.ohgiraffers.section02.copy;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 깊은 복사를 사용한 자바 문법을 이해하고 이를 활용할 수 있다. */
        /* 필기.
        *   깊은 복사는 원본과 복사본 중 둘 중 한 가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
        *  */

        /* 두 개의 같은 값을 가지는 배열을 만들어보자(깊은복사) */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        /* 각 배열의 인덱스에 10씩 값을 누적 증가 */
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println();

    }

}
