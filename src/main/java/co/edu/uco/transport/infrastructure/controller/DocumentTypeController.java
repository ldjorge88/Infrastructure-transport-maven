package co.edu.uco.transport.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/document-type")
public class DocumentTypeController {

  @GetMapping
  public String findAllStrings() {
    return new String("Hello");
  }

}
