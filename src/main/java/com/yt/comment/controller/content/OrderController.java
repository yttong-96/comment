package com.yt.comment.controller.content;

import com.yt.comment.dto.OrdersDto;
import com.yt.comment.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author:Tong
 */
@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping
    public String search(OrdersDto dto, Model model) {
        model.addAttribute("orderList",ordersService.getListByMemberPhone(dto));
        model.addAttribute("searchParam",dto);
        return "/content/orderList";
    }
}
