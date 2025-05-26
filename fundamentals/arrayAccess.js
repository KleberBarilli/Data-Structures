export const execute = (index) => {
  const arr = [1, 2, 3, 4, 5];

  console.log(`Array: [${arr.join(', ')}]`);
  console.log(`Accessing index \x1b[33m${index}\x1b[0m`);
  console.log(`Value: \x1b[32m${arr[index]}\x1b[0m\n`);

  return arr[index];
};