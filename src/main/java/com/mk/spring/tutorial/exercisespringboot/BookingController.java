package com.mk.spring.tutorial.exercisespringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mkanwar on 06/09/17.
 */
@Controller
public class BookingController {
    private final static Logger logger = LoggerFactory.getLogger(BookingController.class);

    @Autowired
    private BookingService service;
    @RequestMapping("/bookedseats")
    public  String books(@RequestParam(value="message", required=false) String message, Model model) {
        model.addAttribute("message", message);
        model.addAttribute("bookings", service.findAllBookings());
        return "booking";
    }
    @RequestMapping(value = "/book" , method = { RequestMethod.POST  })
    public ModelAndView bookSeat(@RequestParam(value="name1", required=false) String name1,
                                 @RequestParam(value="name2", required=false) String name2,
                                 @RequestParam(value="name3", required=false) String name3,
                                 @RequestParam(value="name4", required=false) String name4,
                                 @RequestParam(value="name5", required=false) String name5,
                                 @RequestParam(value="name6", required=false) String name6) {
        String message= " Success";
        service.book(name1,name2,name3,name4,name5,name6);
        return new ModelAndView("redirect:/bookedseats","message",message);

    }


}
