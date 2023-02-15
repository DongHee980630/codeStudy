package src;


class Solution1 {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            answer += s.charAt(s.length()/2 - 1);
            answer += s.charAt(s.length()/2);
        }else{
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}

//두 정수 사이의 합
class Solution2 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a <= b){
            for(int i = a; i <= b; i ++){
                answer += i;
            }
        }else{
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }
        return answer;
    }
}

//문자열을 정수로 바꾸기
class Solution3 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}

//짝수와 홀수
class Solution4 {
    public String solution(int num) {
        String answer = "";
        return num % 2 == 0 ? "Even":"Odd";
    }
}

//평균 구하기
class Solution5 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for(int ar : arr){
            sum += ar;
            answer = (sum/arr.length);
        }
        return answer;
    }
}

//핸드폰 번호 가리기
class Solution6 {
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

//음양 더하기
class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

//없는 숫자 더하기
class Solution8 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}

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
