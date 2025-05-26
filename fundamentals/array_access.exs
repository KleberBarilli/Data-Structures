defmodule ArrayAccess do
  def execute(index) do
    arr = [1, 2, 3, 4, 5]

    IO.puts("Array: #{inspect(arr)}")
    IO.puts("Accessing index \e[33m#{index}\e[0m")

    value = Enum.at(arr, index)

    IO.puts("Value: \e[32m#{value}\e[0m\n")
    value
  end
end
