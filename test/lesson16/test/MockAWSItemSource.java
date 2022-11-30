package lesson16.test;

import com.hillel.homeWork.lesson16.practicum.ItemSource;

import java.util.ArrayList;
import java.util.List;

class MockAWSItemSource implements ItemSource {
    List<Integer> list = new ArrayList<>();

    public MockAWSItemSource(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getItems() {
        return list;
    }
}

