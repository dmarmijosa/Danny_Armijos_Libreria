def call(boolean abortPipeline = false) {
    // Ejecución simulada con timeout de 5 minutos
    timeout(time: 5, unit: 'MINUTES') {
        sh 'echo "Ejecución de las pruebas de calidad de código"'
    }
    // Lógica de control
    def branch = 'development'
    if (abortPipeline) {
        error "Aborto del pipeline: parámetro abortPipeline es true."
    } else if (branch == 'master' || branch.startsWith('hotfix')) {
        error "Aborto del pipeline: rama '${branch}' no es permitida."
    } else {
        echo "Continuando ejecución, rama '${branch}' es permitida."
    }
}
