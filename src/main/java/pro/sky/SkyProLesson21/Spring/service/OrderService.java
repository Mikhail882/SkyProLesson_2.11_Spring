package pro.sky.SkyProLesson21.Spring.service;

import java.util.List;

public interface OrderService {

    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();

}
