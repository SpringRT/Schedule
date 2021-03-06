package com.a11.schedule.repository;

import com.a11.schedule.entity.ScheduleItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleItemRepository extends CrudRepository<ScheduleItem, ScheduleItem.Pk> {

    List<ScheduleItem> findByPkTeacherId(long id);
}
