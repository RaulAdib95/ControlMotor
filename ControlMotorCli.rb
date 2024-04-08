def menu
    puts ""
    puts "**Opciones:**"
    puts "1. Girar a la derecha"
    puts "2. Girar a la izquierda"
    puts "3. Detener motor"
    puts "4. Salir"
    puts ""

    opcion = gets.chomp.to_i

    case opcion
    when 1
      puts "Girando a la derecha..."
    when 2
      puts "Girando a la izquierda..."
    when 3
      puts "Deteniendo motor..."
    when 4
      puts "Saliendo..."
      @salir = true
    else
      puts "Opción no válida."
    end
  end

  @salir = false

  loop do
    menu
    break if @salir
  end
