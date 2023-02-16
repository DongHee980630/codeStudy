package algorithm;

import java.util.Arrays;

//핸드폰 번호 가리기
class Solution9 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i ++){
            if(i < phone_number.length() - 4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
}

//행렬의 덧셈
class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

}

//x만큼 간격이 있는 n개의 숫자
class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long y = x;

        for(int i = 0; i < answer.length; i++){
            answer[i] = y;
            y += x;
        }
        return answer;
    }
}

//부족한 금액 계산하기
class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 0; i <= count; i++){
            sum += price * i;
        }
        if(sum > money){
            answer = sum - money;
        }

        return answer;
    }
}


//2016년
class Solution13 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int asd = 0;
        for(int i = 0; i < a-1;i ++){
            asd += date[i];
        }
        asd += b-1;   // -1을 안해주면  1월1일이 지나간걸로 나온다....
        answer = (day[asd%7]);
        return answer;
    }
}
//import java.util.*;
class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                a++;
            }
        }
        if(a == 0){
            int[]answer = {-1};
            return answer;
        }
        int[]answer = new int[a];
        for(int i = 0, j =0;i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        Arrays.sort(answer); //오름차순으로 정렬하는 매소드
        return answer;
    }
}

//내적
class Solution15 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){

            answer += a[i]*b[i];

        }
        return answer;
    }
}

//문자열 내 p와 y의 개수
class Solution16 {
    boolean solution(String s) {
        boolean answer = true;
        char ch = ' ';
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == 'p' || ch == 'P'){
                sum++;
            }else if(ch =='y' || ch == 'Y'){
                sum--;
            }
        }if(sum != 0){
            return false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return answer;
    }
}

//문자열 다루기 기본
class Solution17 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return answer;
    }
}

//서울에서 김서방 찾기
class Solution18 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}

//수박수박수박수박수박수?
class Solution19 {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            if(i % 2 ==0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}

//완주하지 못한 선수
class Solution20 {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            if(i % 2 ==0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}

