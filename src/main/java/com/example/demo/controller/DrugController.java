@RestController
@RequestMapping("/api/drugs")
@Tag(name = "Drugs")
public class DrugController {

    private final DrugService drugService;

    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @PostMapping
    @Operation(summary = "Create drug (ADMIN)")
    public ResponseEntity<?> create(@Valid @RequestBody DrugRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(drugService.createDrug(req));
    }

    @GetMapping("/{code}")
    @Operation(summary = "Get drug by code")
    public ResponseEntity<?> getByCode(@PathVariable String code) {
        return ResponseEntity.ok(drugService.getByCode(code));
    }

    @GetMapping
    @Operation(summary = "Search drugs by name")
    public ResponseEntity<?> search(
            @RequestParam String name,
            Pageable pageable) {
        return ResponseEntity.ok(
                drugService.searchByName(name, pageable)
        );
    }
}
