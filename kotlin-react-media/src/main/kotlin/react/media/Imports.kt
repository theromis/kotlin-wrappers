@file:JsModule("react-media")
@file:JsNonModule

package react.media

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external class Media : Component<MediaProps, RState> {
    override fun render(): ReactElement?
}

external interface MediaProps : RProps {
    var query: Query<*, *, *>
}