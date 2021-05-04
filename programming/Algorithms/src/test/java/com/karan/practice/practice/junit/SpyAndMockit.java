package com.karan.practice.practice.junit;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class SpyAndMockit {

    @Mock
    List<String> mockedList = mock(ArrayList.class);

    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {

        List mockList = mock(ArrayList.class);
        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }


    @Test
    public void whenUseMockAnnotation() {
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
    }

    @Test
    public void spyAnnontation() {
        List<String> spyList = spy(new ArrayList<String>());

        spyList.add("One");
        spyList.add("two");

        assertEquals(2, spyList.size());
        spyList.remove(1);
        assertEquals(1, spyList.size());

        Mockito.verify(spyList).add("One");

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());

    }


    @Test
    public void captorTest(){

     List<String> captu = mock(List.class);
     captu.add("one");
        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
        Mockito.verify(captu).add(arg.capture());
        assertEquals("one" , arg.getValue());
    }
}
