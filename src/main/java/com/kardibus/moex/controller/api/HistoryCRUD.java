package com.kardibus.moex.controller.api;

import com.kardibus.moex.dto.HistoryDTO;
import com.kardibus.moex.domain.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController()
@RequestMapping("api")
public class HistoryCRUD {

    private HistoryDTO historyDTO;

    @Autowired
    public HistoryCRUD(HistoryDTO historyDTO) {
        this.historyDTO = historyDTO;
    }

    @GetMapping("history")
    public List<HistoryEntity> gelAllHistory() {
        return historyDTO.getAllHistory();
    }

    @GetMapping("history/{id}")
    public Optional<HistoryEntity> getOneHistory(@PathVariable("id") Long id) {
        return historyDTO.getOneHistory(id);
    }

    @DeleteMapping("history/{id}")
    public void deleteHistory(@PathVariable("id") Long id){
      historyDTO.deleteHistory(id);
    }

    @PutMapping("history/{id}")
    public List<HistoryEntity> updateHistory(@PathVariable("id") HistoryEntity id, @RequestBody Map<String,String> history) throws ParseException {
        return historyDTO.updateHistory(id,history);
    }

    @PostMapping("history")
    public List<HistoryEntity> createHistori(@RequestBody Map<String,String> history) throws ParseException {
        return historyDTO.createHistory(history);
    }
}
