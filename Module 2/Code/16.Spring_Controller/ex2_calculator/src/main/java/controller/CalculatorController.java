package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/caculator")
    public ModelAndView Caculator(@RequestParam("firstOperand") String firstOperand,
                                  @RequestParam("secondOperand") String secondOperand,
                                  @RequestParam("calculator") String calculator,
                                  Model model) {
        float first = Float.parseFloat(firstOperand);
        float second = Float.parseFloat(secondOperand);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        model.addAttribute("calculator", calculator);
        float result = Caculator(first, second, calculator);

        ModelAndView modelAndView = new ModelAndView("index", "result", result);
        return modelAndView;
    }

    public float Caculator(float firstOperand, float secondOperand, String calculator) {
        float result = 0;
        switch (calculator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand == 0) {
                    throw new RuntimeException("can't division by 0");
                } else {
                    result = firstOperand / secondOperand;
                    break;
                }
        }
        return result;
    }
}
