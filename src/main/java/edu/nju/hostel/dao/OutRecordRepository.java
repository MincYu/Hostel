package edu.nju.hostel.dao;

import edu.nju.hostel.entity.OutRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuminchen
 * @version V1.0
 * @date 2017/3/11
 */
public interface OutRecordRepository extends JpaRepository<OutRecord, Integer> {
}
