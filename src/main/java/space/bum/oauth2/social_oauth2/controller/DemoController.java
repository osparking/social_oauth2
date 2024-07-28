package space.bum.oauth2.social_oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/demo")
public class DemoController {
  @GetMapping
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("안녕이라고 말하지마!");
  }
}
