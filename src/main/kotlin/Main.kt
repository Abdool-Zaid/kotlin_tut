fun main(){


}



sealed class view_state {

    object loading_state :view_state()
    data class success_state(var data: Some_data): view_state()
    data class error_state(val error: Some_data): view_state()

}
data class Some_data(
    val name :String
)