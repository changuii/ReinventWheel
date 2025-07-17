package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String val = br.readLine();
        int c = 0;

        if(N - M == 1){
            int max = 0;
            for(int i=0; i<N; i++){
                max = Math.max(max, val.charAt(i));
            }
            System.out.println(((char) max) +"");
            return;
        }

        StringBuilder sb = new StringBuilder(val);
        int now = 0;
        for(int i=0; i<M; i++){

            boolean flag = false;
            for(int j=now; j<sb.length()-1; j++){
                c++;
                if(sb.charAt(j) < sb.charAt(j+1)){
                    sb.deleteCharAt(j);
                    now = j == 0 ? 0 : j-1;
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println(sb.substring(0, sb.length()-M+i));
                System.out.println(c);
                return;
            }
        }

        System.out.println(sb);
        System.out.println(c);
    }
}
