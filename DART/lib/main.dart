
// Quick lesson about Dart
// In line comment
/*
  Multi line comment
 */

// import of file
import '../lib/example/example.dart' as example;

void main(List<String> arguments) {
  print("Hello World ${example.value}"); // using import variable and string interpolation
  print("Example of string interpolation ${example.value += 1000}"); // operation first, assignment last
  print("Now example.value is ${example.value}");
  print("Ternary operation ${example.value < 3000 ? "Work" : "Not work"}"); // Ternary operation

  // declaration of variable
  bool isOn = true;
  bool? isOff;

  print("Default value of mutable nullable boolean is $isOff");
  print("Use of methods for null bool? ${isOff.runtimeType}\nperhaps it\'s not for mutable non nullable bool (isOn) ${isOn.runtimeType}");

  // Of course there are other type
  num age = 20;
  Type ageType = age.runtimeType; // Type also are assigned to a new variable, cool!

  print("Declared a num var with value ${age} and Type ${ageType}");

  num kgs = 80.4;

  print("Declare a new variable with value ${kgs} and type ${kgs.runtimeType}");
  print("Sign method ${kgs.sign} and finite ${kgs.isFinite} or negative ${kgs.isNegative}");
  // Also it's possible to parse a num to int or double
  print("Parse int ${int.tryParse(age.toString(), radix: 10)} and parse double ${double.tryParse(age.toString())}");
  print("${kgs + kgs}");
  print("${kgs / 2}");
  print("${age % 2}");

  // and string
  String ex = "Example";
  print("Example substring from 0 to 2 ${ex.substring(0, 2)}");
  print("Example split with all characters as list ${ex.split("")}");

  // Declare constant using const keyword
  const String constant = "constant example";
  print("${constant.split(" ")}");
}