package com.example.kotlinpractice.springdoc.controller

import com.example.kotlinpractice.springdoc.entity.User
import com.example.kotlinpractice.springdoc.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("test")
class UserController(val userService: UserService) {

    @PostMapping("user/register")
    fun register(@RequestBody user: User) = userService.register(user)

    @GetMapping("users")
    fun getAll() = userService.findAll()

    @GetMapping("users/{id}")
    fun getUser(@PathVariable id: Long) = userService.findById(id)

    @PutMapping("user/{id}")
    fun updateUser(@RequestBody user: User) = userService.update(user)

    @DeleteMapping("user/{id}")
    fun deleteUser(@PathVariable id: Long) = userService.delete(id)
}