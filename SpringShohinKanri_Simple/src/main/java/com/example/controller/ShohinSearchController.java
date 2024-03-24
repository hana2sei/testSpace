package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品検索画面 コントローラ
 */
@Controller
@RequestMapping("shohinKanri")
public class ShohinSearchController {

	@GetMapping("/shohinSearch")
	public String getShohinSearch() {
		return "view/shohin_search";
	}
}
