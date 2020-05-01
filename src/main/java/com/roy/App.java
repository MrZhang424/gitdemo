package com.roy;

import com.roy.service.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TestService ts =new TestService();
        System.out.println( "这是第一个和GitHub有关的项目" );
        System.out.println(ts.getMe());
        System.out.println(ts.getByName());
    }
}
