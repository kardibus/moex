package com.kardibus.moex.service.workFile;

import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service
public class FileReader {

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    private ParserHistoryXML parserHistoryXML;
    private ParserSecuritiesXML parserSecuritiesXML;

    public FileReader(ParserSecuritiesXML parserSecuritiesXML,ParserHistoryXML parserHistoryXML){
        this.parserHistoryXML = parserHistoryXML;
        this.parserSecuritiesXML = parserSecuritiesXML;
    }

    public void start() {

        Future<Long> submit = (Future<Long>) executorService.submit(parserHistoryXML);

        try {
            submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Future<Long> submit2 = (Future<Long>) executorService.submit(parserSecuritiesXML);

        try {
            submit2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        try {
            executorService.awaitTermination(1000, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

}
