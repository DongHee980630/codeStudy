package algorithm;

//이상한 문자 만들기
class Solution21 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int a = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i].equals(" ")){
                a = 0;

            }else if(a % 2 == 0){
                arr[i] = arr[i].toUpperCase();
                a ++;
            }else{
                arr[i] = arr[i].toLowerCase();
                a++;
            }
            answer += arr[i];
        }
        return answer;
    }
}

//자릿수 더하기
class Solution22 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
//자연수 뒤집기
class Solution23 {
    public int[] solution(long n) {
        String a = n +"";
        int[] answer = new int[a.length()];
        for(int i = 0; n > 0; i++){
            answer[i] += (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}

