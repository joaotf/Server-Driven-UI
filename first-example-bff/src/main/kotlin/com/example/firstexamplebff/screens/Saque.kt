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
class Saque {
    val style = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            padding = EdgeValue(all = UnitValue(0.3, type = UnitType.PERCENT))
    )
    val button = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            margin = EdgeValue(all = UnitValue(0.8, type = UnitType.PERCENT))
    )
    fun withdraw_cash(): Screen = Screen(child = Container(children = listOf(
            Text(text =  "Quanto você deseja sacar?")
                    .applyStyle(style=style),

            Button(text = "R$   10,00").applyStyle(style=button),
            Button(text = "R$   20,00").applyStyle(style=button),
            Button(text = "R$   50,00").applyStyle(style=button),
            Button(text = "R$   100,00").applyStyle(style=button),
            Button(text = "R$   200,00").applyStyle(style=button),
            Button(text = "Outro valor").applyStyle(style=button),
            Button(text = "Voltar",onPress = listOf(
                    Navigate.PushStack(
                            route = Route.Remote("/homepage")
            ))).applyStyle(style = button)

    )))
}
