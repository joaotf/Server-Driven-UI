package com.example.firstexamplebff.controllers

import com.example.firstexamplebff.screens.*
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin("*")
@RestController
class ScreenController(private val HomePage: HomePage,
                       private val Saque: Saque,
                       private val Deposito: Deposito,
                       private val Extrato: Extrato,
                       private val Transferencia: Transferencia,
                       private val Pagamento: Pagamento,
                       private val Configuracao: Modificacoes
) {

    @GetMapping("/homepage")
    fun getScreen() = HomePage.createScreen()

    @GetMapping("/services/withdraw_cash")
    fun cash() = Saque.withdraw_cash()

    @GetMapping("/services/deposit")
    fun deposito() = Deposito.deposit()

    @GetMapping("/services/extract")
    fun extract() = Extrato.extract()

    @GetMapping("/services/transfer")
    fun transfer() = Transferencia.transfer()

    @GetMapping("/services/payment")
    fun payment() = Pagamento.payment()

    @GetMapping("/services/configs")
    fun configs() = Configuracao.modification()

}