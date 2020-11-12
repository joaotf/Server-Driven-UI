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
class Extrato {

    val button = Style(
            flex = Flex(alignSelf = AlignSelf.CENTER),
            margin = EdgeValue(all = UnitValue(0.8, type = UnitType.PERCENT))
    )

    fun extract(): Screen = Screen(child = Container(children = listOf(
            Text(text =  "Extrato"),

            Button("Voltar", onPress = listOf(
                Navigate.PushStack(
                    route = Route.Remote("/homepage"))
            )).applyStyle(style=button)
    )))
}
