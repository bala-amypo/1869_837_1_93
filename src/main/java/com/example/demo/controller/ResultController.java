@RestController
@RequestMapping("/api/results")
@Tag(name = "Results")
public class ResultController {

    private final InteractionResultService resultService;

    public ResultController(InteractionResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get result by ID")
    public ResponseEntity<?> get(@PathVariable Long id) {
        return ResponseEntity.ok(resultService.getResult(id));
    }

    @GetMapping
    @Operation(summary = "List results by severity")
    public ResponseEntity<?> list(
            @RequestParam String severity,
            Pageable pageable) {
        return ResponseEntity.ok(
                resultService.getBySeverity(severity, pageable)
        );
    }
}
