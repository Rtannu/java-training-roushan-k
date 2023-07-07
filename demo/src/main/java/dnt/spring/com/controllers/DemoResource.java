package dnt.spring.com.controllers;

import dnt.spring.com.requests.WordRequest;
import dnt.spring.com.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/resource")
public class DemoResource {

    @Autowired
    private DemoService demoService;

    @GetMapping()
    public List<String> getHelloWord(){
        return demoService.getNames();
    }

    @PostMapping()
    public String addHelloWord(@RequestBody WordRequest wordRequest){
         return demoService.addName(wordRequest.getName());

    }

    @PutMapping(path = "/{idx}")
    public String updateHelloWord(@RequestBody WordRequest wordRequest,@PathVariable(name = "idx") Integer idx){
            return demoService.updateName(wordRequest.getName(),idx);
    }

    @DeleteMapping()
    public String deleteHelloWord(@RequestParam(name = "word") String word){
        return demoService.removeName(word);
    }
}