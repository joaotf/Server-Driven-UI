package com.example.firstexamplebff.screens

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import org.springframework.stereotype.Service

@Service
class HomePage {
    val style = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            margin = EdgeValue(all = UnitValue(0.5, type = UnitType.PERCENT))
    )

    fun createScreen(): Screen = Screen(child = Container(children = listOf(
            Text(text =  "Bem vindo, João !"),

            Button(text = "Saque", onPress = listOf(
                    Navigate.PushStack(
                        route = Route.Remote("/services/withdraw_cash")
                    ))).applyStyle(style = style),
            Button(text = "Depósito",onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/services/deposit")
                    ))).applyStyle(style = style),
            Button(text = "Extrato",onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/services/extract")
                    ))).applyStyle(style = style),
            Button(text = "Transferência",onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/services/transfer")
                    ))).applyStyle(style = style),
            Button(text = "Pagamento", onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/services/payment")
                    ))).applyStyle(style = style),
            Button(text = "Modificações de entrada",onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/services/withdraw_cash")
                    ))).applyStyle(style = style)

    )))
}
