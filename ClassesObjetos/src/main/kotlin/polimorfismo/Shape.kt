package polimorfismo

class Shape{
    // observação já é criado o método getter e setter
    // diferente do java não precisa escrever getter e setter
    var nome : String = ""
        get(){
            field = if(field != ""){
                "ok - nome: ${field}"
            } else
                "vazio"
            return field
        }
        set(value){
            if(value != "")
                field = value
        }

}