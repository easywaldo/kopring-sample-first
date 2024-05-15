package com.example.kopringdemo.application

import com.example.kopringdemo.service.MessageService
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val messageService: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = messageService.findMessages()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
        messageService.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        messageService.save(message)
    }
}

data class Message(val id: String?, val text: String)
