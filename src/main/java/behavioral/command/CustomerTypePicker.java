package behavioral.command;

class CustomerTypePicker {

  static BillPayer getStudent() {
    return new Student();
  }

  static BillPayer getManOver60() {
    return new ManOver60();
  }

  static BillPayer getManUnder60() {
    return new ManUnder60();
  }

  static BillPayer getWomanOver60() {
    return new WomanOver60();
  }
}
