
### 📋 **Test Cases for IsValidISBN10 SOAP API**

| Test Case ID  | Test Case Name                  | Preconditions                | Test Steps                                      | Test Data     | Expected Result               | Actual Result | Status (Pass/Fail) | Remarks                      |
| ------------- | ------------------------------- | ---------------------------- | ----------------------------------------------- | ------------- | ----------------------------- | ------------- | ------------------ | ---------------------------- |
| TC\_ISBN\_001 | Validate correct ISBN10 number  | Service is up                | Send SOAP request with `sISBN = 0306406152`     | `0306406152`  | `IsValidISBN10Result = true`  | —             | —                  | Valid ISBN test              |
| TC\_ISBN\_002 | Validate ISBN10 ending with 'X' | Service is available         | Send SOAP request with `sISBN = 097522980X`     | `097522980X`  | `IsValidISBN10Result = true`  | —             | —                  | Valid ISBN with checksum 'X' |
| TC\_ISBN\_003 | Invalid ISBN10 (wrong checksum) | Service should return false  | Send SOAP request with `sISBN = 0306406153`     | `0306406153`  | `IsValidISBN10Result = false` | —             | —                  | Invalid checksum             |
| TC\_ISBN\_004 | Short input (9 digits)          | None                         | Send SOAP request with `sISBN = 123456789`      | `123456789`   | `IsValidISBN10Result = false` | —             | —                  | Too short                    |
| TC\_ISBN\_005 | Long input (11 digits)          | None                         | Send SOAP request with `sISBN = 12345678901`    | `12345678901` | `IsValidISBN10Result = false` | —             | —                  | Too long                     |
| TC\_ISBN\_006 | Special character input         | None                         | Send SOAP request with `sISBN = #$%@^!`         | `#$%@^!`      | `Error or false`              | —             | —                  | Special characters           |
| TC\_ISBN\_007 | Empty input                     | None                         | Send SOAP request with `sISBN = ""`             | `""`          | `Error or false`              | —             | —                  | Blank input                  |
| TC\_ISBN\_008 | SOAP 1.1 Protocol validation    | Use correct SOAP 1.1 headers | Send SOAP 1.1 request with `sISBN = 0306406152` | `0306406152`  | `IsValidISBN10Result = true`  | —             | —                  | SOAP 1.1                     |
| TC\_ISBN\_009 | SOAP 1.2 Protocol validation    | Use correct SOAP 1.2 headers | Send SOAP 1.2 request with `sISBN = 0306406152` | `0306406152`  | `IsValidISBN10Result = true`  | —             | —                  | SOAP 1.2                     |
| TC\_ISBN\_010 | Null input                     | None                  | Send SOAP request with `sISBN` tag omitted      | `<sISBN> (not provided)` | Server error or `false`    | —             | —                  | Null field handling                              |
| TC\_ISBN\_011 | Alphabetic input               | None                  | Send SOAP request with `sISBN = ABCDEFGHIJ`     | `ABCDEFGHIJ`             | `false` or error           | —             | —                  | Purely alphabetic input                          |
| TC\_ISBN\_012 | Mixed alphanumeric input       | None                  | Send SOAP request with `sISBN = 1234X6789A`     | `1234X6789A`             | `false`                    | —             | —                  | Mixed input with invalid placement of characters |
| TC\_ISBN\_013 | All zeros                      | None                  | Send SOAP request with `sISBN = 0000000000`     | `0000000000`             | `false`                    | —             | —                  | Invalid even if structurally 10 digits           |
| TC\_ISBN\_014 | Input with whitespace          | None                  | Send SOAP request with `sISBN = " 0306406152 "` | `" 0306406152 "`         | `false` or error           | —             | —                  | Test whitespace trimming                         |
| TC\_ISBN\_015 | SQL Injection attempt          | None                  | Send `sISBN = 1234567890' OR '1'='1`            | `1234567890' OR '1'='1`  | `false` or sanitized input | —             | —                  | Security test                                    |
| TC\_ISBN\_016 | JSON request with valid ISBN   | Service supports JSON | Send POST with JSON `{ "sISBN": "0306406152" }` | JSON input               | `true`                     | —             | —                  | JSON request format                              |
| TC\_ISBN\_017 | JSON request with invalid ISBN | Service supports JSON | Send POST with JSON `{ "sISBN": "1234567890" }` | JSON input               | `false`                    | —             | —                  | JSON invalid case                                |
| TC\_ISBN\_018 | XML with incorrect namespace   | None                  | Change namespace to an incorrect value          | Invalid namespace        | `error`                    | —             | —                  | XML structure validation                         |
| TC\_ISBN\_019 | Missing Content-Type header    | None                  | Send request without Content-Type header        | Valid body               | HTTP 415 or error          | —             | —                  | Header requirement validation                    |




