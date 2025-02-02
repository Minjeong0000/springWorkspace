package com.kh.jmj.board.controller;

import com.kh.jmj.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")

public class BoardController {

    @Autowired
    private BoardService bs;


    @GetMapping("list")
    public void findBoardAll(){
        System.out.println("BoardController.findBoardAll~~~~~~~~~~~~~~~");
        bs.findBoardAll();
    }
    @GetMapping("one")
    public void findBoardByNo(){
        System.out.println("BoardController.findBoardByNo~~~~~~~~~~~~~");
        bs.findBoardByNo();
    }

    @GetMapping("insert")
    public void insertBoard(){
        System.out.println("BoardController.insertBoard~~~~~~~~~~~~~~");
        bs.insertBoard();
    }


}//class
