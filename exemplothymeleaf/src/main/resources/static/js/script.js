function atualizarTarefa(element){
    if(element.innerHTML === 'Concluída'){
        element.innerHTML = 'Pendente';
        element.ClassName = 'tarefa-pendente';
    } else {
        element.innerHTML = 'Concluída';
        element.ClassName = 'tarefa-concluida';
    }
}

