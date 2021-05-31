package com.kardibus.moex.controller;

import com.kardibus.moex.dto.HistoryDTO;
import com.kardibus.moex.domain.entity.HistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("history")
public class HistoryController {

    private HistoryDTO historyDTO;

    @Autowired
    public HistoryController(HistoryDTO historyDTO) {
        this.historyDTO = historyDTO;
    }

    @GetMapping
    public String getAllHistory(Model model){
        model.addAttribute("history", historyDTO.getAllHistory());
        return "history";
    }

    @PostMapping("/delete/{id}")
    public String deleteHistory(@PathVariable("id") Long id) {
        historyDTO.deleteHistory(id);
        return "redirect:/history";
    }

    @PostMapping("/update")
    public String updateHistory(@RequestParam("id") HistoryEntity id, @RequestParam("TRADEDATE") String tradedate,
                                @RequestParam("LOW") String low,@RequestParam("SECID") String secid,
                                @RequestParam("LEGALCLOSEPRICE") String legalcloseprice, @RequestParam("HIGH") String high,
                                @RequestParam("CLOSE") String close, @RequestParam("VALUE") String value,
                                @RequestParam("BOARDID") String boardid, @RequestParam("OPEN") String open,
                                @RequestParam("VOLUME") String volume, @RequestParam("NUMTRADES") String numtrades,
                                @RequestParam("SHORTNAME") String shortname, @RequestParam("WAPRICE") String waprice,
                                @RequestParam("MARKETPRICE2") String marketprice2,
                                @RequestParam("waval") String waval,
                                @RequestParam("MP2VALTRD") String mp2VALTRDб,@RequestParam("MARKETPRICE3") String marketprice3,
                                @RequestParam("ADMITTEDQUOTE") String admittedquote,@RequestParam("admittedvalue") String admittedvalue,
                                @RequestParam("MARKETPRICE3TRADESVALUE") String marketprice3TRADESVALUE) throws ParseException {
        Map<String,String> map = new HashMap<>();
        map.put("secid",secid);
        map.put("tradedate",tradedate);
        map.put("low",low);
        map.put("legalcloseprice",legalcloseprice);
        map.put("high",high);
        map.put("close",close);
        map.put("value",value);
        map.put("boardid",boardid);
        map.put("open",open);
        map.put("volume",volume);
        map.put("numtrades",numtrades);
        map.put("shortname",shortname);
        map.put("waprice",waprice);
        map.put("marketprice2",marketprice2);
        map.put("mp2VALTRDб",mp2VALTRDб);
        map.put("marketprice3",marketprice3);
        map.put("admittedquote",admittedquote);
        map.put("marketprice3TRADESVALUE",marketprice3TRADESVALUE);
        map.put("admittedvalue",admittedvalue);
        map.put("waval",waval);

        historyDTO.updateHistory(id,map);
        return "redirect:/history";
    }

    @PostMapping("/create")
    public String createHistory(@RequestParam("TRADEDATE") String tradedate,
                                @RequestParam("LOW") String low,@RequestParam("SECID") String secid,
                                @RequestParam("LEGALCLOSEPRICE") String legalcloseprice, @RequestParam("HIGH") String high,
                                @RequestParam("CLOSE") String close, @RequestParam("VALUE") String value,
                                @RequestParam("BOARDID") String boardid, @RequestParam("OPEN") String open,
                                @RequestParam("VOLUME") String volume, @RequestParam("NUMTRADES") String numtrades,
                                @RequestParam("SHORTNAME") String shortname, @RequestParam("WAPRICE") String waprice,
                                @RequestParam("MARKETPRICE2") String marketprice2,
                                @RequestParam("waval") String waval,
                                @RequestParam("MP2VALTRD") String mp2VALTRD,@RequestParam("MARKETPRICE3") String marketprice3,
                                @RequestParam("ADMITTEDQUOTE") String admittedquote,@RequestParam("admittedvalue") String admittedvalue,
                                @RequestParam("MARKETPRICE3TRADESVALUE") String marketprice3TRADESVALUE) throws ParseException {
        Map<String,String> map = new HashMap<>();
        map.put("secid",secid);
        map.put("tradedate",tradedate);
        map.put("low",low);
        map.put("legalcloseprice",legalcloseprice);
        map.put("high",high);
        map.put("close",close);
        map.put("value",value);
        map.put("boardid",boardid);
        map.put("open",open);
        map.put("volume",volume);
        map.put("numtrades",numtrades);
        map.put("shortname",shortname);
        map.put("waprice",waprice);
        map.put("marketprice2",marketprice2);
        map.put("mp2VALTRD",mp2VALTRD);
        map.put("marketprice3",marketprice3);
        map.put("admittedquote",admittedquote);
        map.put("marketprice3TRADESVALUE",marketprice3TRADESVALUE);
        map.put("admittedvalue",admittedvalue);
        map.put("waval",waval);

        historyDTO.createHistory(map);
        return "redirect:/history";
    }
}
