package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
private static int test = 1;
public static ArrayList<Integer> normalArrayListCreator(){
    ArrayList<Integer> standardArrayList = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
          standardArrayList.add(i);
      }
      return standardArrayList;
}

@Before
public void before() {
       switch (test) {
            case 1:
            System.out.println("Empty ArrayList Test is in progress.");
            break;
            case 2:
            System.out.println("Standard ArrayList Test is in progress.");
            break;
            }
}
@After
    public void after() {
            System.out.println("End of test.\n");
}

@Test
//test gdy lista jest pusta
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumberExterminator odds = new OddNumberExterminator();
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        //When
        ArrayList<Integer> result = odds.exterminate(emptyArrayList);
        //Then
        Assert.assertEquals(0, result.size());
        test = 2;
}

@Test
//test gdy lista zawiera parzyste i nieparzyste
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator odds = new OddNumberExterminator();
        ArrayList<Integer> list = normalArrayListCreator();
        //When
        ArrayList<Integer> result = odds.exterminate(list);
        //Then
        Assert.assertEquals(4, result.size());
        }
}