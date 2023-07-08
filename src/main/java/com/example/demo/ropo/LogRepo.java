package com.example.demo.ropo;

import com.example.demo.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepo extends JpaRepository<Log,Long> {
}
