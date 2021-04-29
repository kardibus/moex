package com.kardibus.moex.controller.api;

import com.kardibus.moex.dao.HistoryDAO;
import com.kardibus.moex.domain.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController()
@RequestMapping("api")
public class HistoryCRUD {

    private HistoryDAO historyDAO;

    @Autowired
    public HistoryCRUD(HistoryDAO historyDAO) {
        this.historyDAO = historyDAO;
    }

    @GetMapping("history")
    public List<HistoryEntity> gelAllHistory() {
        return historyDAO.getAllHistory();
    }

    @GetMapping("history/{id}")
    public Optional<HistoryEntity> getOneHistory(@PathVariable("id") Long id) {
        return historyDAO.getOneHistory(id);
    }

    @DeleteMapping("history/{id}")
    public void deleteHistory(@PathVariable("id") Long id){
      historyDAO.deleteHistory(id);
    }

    @PutMapping("history/{id}")
    public List<HistoryEntity> updateHistory(@PathVariable("id") HistoryEntity id, @RequestBody Map<String,String> history){
        return historyDAO.updateHistory(id,history);
    }

    @PostMapping("history")
    public List<HistoryEntity> createHistori(@RequestBody Map<String,String> history){
        return historyDAO.createHistory(history);
    }
}
