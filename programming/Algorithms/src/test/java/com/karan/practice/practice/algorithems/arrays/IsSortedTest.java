package com.karan.practice.practice.algorithems.arrays;

import org.junit.Assert;
import org.junit.Test;

public class IsSortedTest {

    @Test
    public void givenArrayIsInSorted() {
        int a[] = {3, 4, 6, 8};

        Assert.assertTrue(IsSorted.isSort(a));

        int b[] = {1};
        Assert.assertTrue(IsSorted.isSort(b));
    }

    @Test
    public void givenArrayIsNotSorted() {
        int a[] = {3, 2, 6, 8};

        Assert.assertFalse(IsSorted.isSort(a));
    }

    @Test
    public void findMinimumInGivenArray() {
        int a[] = {3, 2, 6, 8};

        Assert.assertEquals(2, IsSorted.minimum(a));
    }
}
