package frontend.components.materialui.Slider


import org.w3c.dom.events.Event
import react.*


fun RBuilder.slider(component: Component<RProps, RState>? = null,
					disabled: Boolean? = false,
					vertical: Boolean? = false,
					max: Number? = 500,
					min: Number? = 0,
					step: Number? = 1,
					value: Number? = 50,
					onChange: (event: Event, value: Number) -> Unit = { event, _value -> console.log(event,_value) },
					onDragEnd: (event: Event) -> Unit = { event -> console.log(event) },
					onDragStart: (event: Event) -> Unit = { event -> console.log(event) },
					handler: RHandler<SliderProps>) = muiSlider {

	component?.let { attrs.component = component }
	attrs.disabled = disabled
	attrs.vertical = vertical
	attrs.max = max
	attrs.min = min
	attrs.step = step
	attrs.value = value
	attrs.onChange = onChange
	attrs.onDragEnd = onDragEnd
	attrs.onDragStart = onDragStart


	handler()
}
