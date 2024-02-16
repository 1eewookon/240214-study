package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 필기.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *   리턴값으로 동일한 배열을 리턴 해주고 싶은 경우 사용한다.
        *  */

        String[] names = {"조평훈", "이순신", "홍길동"};

//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        /* 필기. 얕은 복사 확인을 위한 hashCode 출력 */
        System.out.println("names의 hashCode : " + names.hashCode());

        /* 목차. 1. 인자와 매개변수로 활용 */


    }

}
