package com.corejavainterviewquestions;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueueTest {
    @Test
    public void addingOneItemAndRemovingFromQueueWillReturnThatItem() throws Exception {
        Queue queue = new Queue();
        queue.add("Item 1");
        assertThat(queue.remove(), is("Item 1"));
    }


    @Test
    public void addingMultipleItemsThenRemovingOneWillReturnFirstItem() throws Exception {
        Queue queue = new Queue();
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");
        assertThat(queue.remove(), is("Item 1"));
    }
}