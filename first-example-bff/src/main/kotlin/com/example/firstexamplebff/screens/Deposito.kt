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
import br.com.zup.beagle.widget.ui.TextInput
import org.springframework.stereotype.Service


@Service
class Deposito {
    val style = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            padding = EdgeValue(all = UnitValue(0.3, type = UnitType.PERCENT))
    )
    val button = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            margin = EdgeValue(all = UnitValue(0.8, type = UnitType.PERCENT))
    )
    fun deposit(): Screen = Screen(child = Container(children = listOf(
            Text(text =  "Valor do Depósito").applyStyle(style = style),
            TextInput(value = "").applyStyle(style = style),
            Text(text =  "Agência").applyStyle(style = style),
            TextInput(value = "").applyStyle(style = style),
            Text(text =  "Conta").applyStyle(style = style),
            TextInput(value = "").applyStyle(style = style),
            Button(text="Confirmar").applyStyle(style=button),
            Button("Voltar", onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/homepage"))
            )).applyStyle(style=button)


    )))
}
